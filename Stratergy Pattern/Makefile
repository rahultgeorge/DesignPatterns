
JC=javac
JR=java
runner: ducks
	$(JC)  Runner.java


ducks: duckbehaviours duckbase 
	$(JC)  *Duck.java	
duckbehaviours: 
	    $(JC) *Behaviour.java

duckbase:
	$(JC)  DuckBase.java



clean: 
	rm -f *.class	