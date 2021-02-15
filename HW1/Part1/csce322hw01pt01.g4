grammar csce322hw01pt01;

// tokens
WHITESPACE : [ \t\r\n]+ -> skip;
SECTIONBEGINNING : '\\begin{section}' {System.out.println("Open Section: " + getText());};
SECTIONENDING : '\\end{section}' {System.out.println("Close Section: " + getText());};
SECTIONTITLE  : ('\\title{Moves}' | '\\title{Maze}') {System.out.println("Section Title: " + getText());};
ASSIGNVALUE : '::' {System.out.println("Designation: " + getText() );};
MOVESYMBOL : ('c' | 'cc' | '180') ;
fragment NUMERICALSYMBOL : [0-9];
MAZESYMBOL : ('-' | 'g' | 'x' | NUMERICALSYMBOL+) {System.out.println("Location: " + getText());}; 
ROWENDING : '\\\\' {System.out.println("Close Row: " + getText());};
MAZEBEGINNING : '\\begin{maze}' {System.out.println("Open Maze: " + getText());}	;
MAZEENDING : '\\end{maze}' {System.out.println("Close Maze: " + getText());} ;
LISTBEGINNING : '\\begin{moves}' {System.out.println("Open Moves: " + getText());};
LISTENDING : '\\end{moves}' {System.out.println("Close Moves: " + getText());};
TILDE : '~' ; 
ANY : . {System.out.println("The unrecognizable token " + getText()+ " appears in line " + getLine()+".");
		System.exit(0);};

 
// rules

gravityGame : .* EOF{System.out.println( "Close of File"); };
