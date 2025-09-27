
build:
	@ find . -name "*.java" | while read file; do \
		echo "Compling: file=$${file}" ; \
		javac -cp ./choreo_gen $${file} ; \
	done

format:
	@ java -jar ~/Downloads/google-java-format-1.27.0-all-deps.jar -r choreo_gen/*.java

run: build
	@ java -cp ./choreo_gen FirstSolo
	@ java -cp ./choreo_gen ModelPoses
	@ java -cp ./choreo_gen FinalSolo

clean:
	@ find . -name "*.class" | while read file; do \
		echo "Removing file: file=$${file}" ; \
		rm -f $${file} ; \
	done
