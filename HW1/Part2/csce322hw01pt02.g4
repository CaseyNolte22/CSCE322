// TODO Extra Credit, 


grammar csce322hw01pt02;

@header {
    import java.util.ArrayList;
}

// java variables
@members {
	int number_of_players = 0;
	int number_of_g = 0; 
	int number_of_x = 0;
	int total_maze_symbols = 0;
	int n = 0;
	int k = 0;
	int g_i_pos = 0;
	int g_j_pos = 0;
	ArrayList<String> row = new ArrayList<String>();
    ArrayList<ArrayList<String>> rowset = new ArrayList<ArrayList<String>>();
	boolean cPresent = false;
	boolean ccPresent = false;
	boolean oneeightyPresent = false; 
	boolean semantic_violated = false;
}


// tokens
WHITESPACE : [ \t\r\n]+ -> skip;
SECTIONBEGINNING : '\\begin{section}';
SECTIONENDING : '\\end{section}';
SECTIONTITLE  : ('\\title{Moves}' | '\\title{Maze}');
ASSIGNVALUE : '::';
MOVESYMBOL : ('c' | 'cc' | '180');
fragment NUMERICALSYMBOL : [0-9] ;
MAZESYMBOL : ('-' | 'g' | 'x' | NUMERICALSYMBOL+); 
ROWENDING : '\\\\';
MAZEBEGINNING : '\\begin{maze}';
MAZEENDING : '\\end{maze}';
LISTBEGINNING : '\\begin{moves}';
LISTENDING : '\\end{moves}';
TILDE : '~'; 
ANY : (.) ;

//startrule
gravityGame : ((moves maze) | (maze moves)) semanticrules EOF;

//rules
begin : SECTIONBEGINNING;

end : SECTIONTITLE;

moves : 
sectionstart LISTBEGINNING movelist sectionend;

movelist @init {n = 0;} : 
((movesymbol TILDE){n++;})* { n >= 5 }? movesymbol;

sectionstart : 
SECTIONBEGINNING SECTIONTITLE ASSIGNVALUE;

sectionend : 
(MAZEENDING | LISTENDING) SECTIONENDING;

maze : 
sectionstart MAZEBEGINNING rowset sectionend; 

row @init {n = 0; row = new ArrayList<String>();}: 
(mazesymbol{n++;}{row.add($mazesymbol.text);})+ {n >= 6}? ROWENDING {rowset.add(row);} ;

finalrow @init {n = 0; row = new ArrayList<String>();} : 
(mazesymbol{n++;}{row.add($mazesymbol.text);})+  {rowset.add(row);} {n >= 6}?;

rowset @init {k = 0;} : 
 (row{k++;})+   finalrow {k >= 5}?;


mazesymbol : MAZESYMBOL 
	{total_maze_symbols++;
	if ($MAZESYMBOL.text.equals("x")) {
		number_of_x++;
	}
	if ($MAZESYMBOL.text.equals("g")) {
		number_of_g++;
		}
	if (!$MAZESYMBOL.text.equals("x") && !$MAZESYMBOL.text.equals("g") && !$MAZESYMBOL.text.equals("-")) {
		number_of_players++;
	}
	};


movesymbol : MOVESYMBOL
	{total_maze_symbols++;
	if ($MOVESYMBOL.text.equals("c")) {
		cPresent = true;
	}
	if ($MOVESYMBOL.text.equals("cc")) {
		ccPresent = true;
		}
	if ($MOVESYMBOL.text.equals("180")) {
		oneeightyPresent = true;
	}
	};

semanticrules : 
{
	for (int i = 0; i < rowset.size(); i++) {
		for (int j = 0; j < rowset.get(i).size(); j++) {
			if (rowset.get(i).get(j).equals("g")) {
				g_i_pos = i;
				g_j_pos = j;
			}
		}
	}
	
	if (number_of_players < 1 | number_of_players > 4) {
		System.out.println("The semantic rule 1 was violated.");
		semantic_violated = true;
	}
	
	if (number_of_g != 1) {
		System.out.println("The semantic rule 2 was violated.");
		semantic_violated = true;
	}
	
	if ((number_of_x / total_maze_symbols) > .6 ) {
		System.out.println("The semantic rule 3 was violated.");
		semantic_violated = true;
	}
	
	if (!cPresent | !ccPresent | !oneeightyPresent) {
		System.out.println("The semantic rule 4 was violated.");
		semantic_violated = true;
	}
	
	if (rowset.get(g_i_pos+1).get(g_j_pos).equals("x") |
		rowset.get(g_i_pos-1).get(g_j_pos).equals("x") |
		rowset.get(g_i_pos).get(g_j_pos+1).equals("x") |
		rowset.get(g_i_pos).get(g_j_pos-1).equals("x")) {
			System.out.println("The semantic rule 5 was violated.");
			semantic_violated = true;
	}
	
	if (!semantic_violated) {
		System.out.println("This game has " + number_of_players + " players.");
	}
};
