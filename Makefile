
build:
	@ find . -name "*.java" | while read file; do \
		echo "Compliing: file=$${file}" ; \
		javac $${file} ; \
	done

run: build
	@ java ./solo_choreo_gen/Generator.java
	@ java ./choreo_gen/GeneratorAll.java
	@ java ./solo_choreo_gen/EndChoreoGenerator.java

clean:
	@ find . -name "*.class" | while read file; do \
		echo "Removing file: file=$${file}" ; \
		rm -f $${file} ; \
	done
