JAVAC=javac
JAVA=java
SOURCES=$(wildcard *.java)
MAIN=Main

compile:
	$(JAVAC) $(SOURCES)

run: compile
	$(JAVA) $(MAIN)

clean:
	rm -f *.class
