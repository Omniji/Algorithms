Data structure notes:
1) When doing large amount of remove/add operations, HashSet are much faster than ArrayList
    For example in LC#127 Word Ladder, had to convert wordList to a hash set, or it will just exceed time limits.

2) Integer a = new Integer(1);
    in this case, a is an object "Integer". But a-1 will be primitive type int.
    
    
