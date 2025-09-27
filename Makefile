
build:
	@ find . -name "*.java" | while read file; do \
		echo "Compling: file=$${file}" ; \
		javac -cp ./choreo_gen $${file} ; \
	done

run: build
	@ java -cp ./choreo_gen Generator
	@ java -cp ./choreo_gen GeneratorAll
	@ java -cp ./choreo_gen EndChoreoGenerator

clean:
	@ find . -name "*.class" | while read file; do \
		echo "Removing file: file=$${file}" ; \
		rm -f $${file} ; \
	done
