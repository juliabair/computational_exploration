# A Computational Exploration

## Summary

A dance performance combining computer science and dance utilizing
custom Java and Python programs to randomize and increasingly control
the choreography.

## Details

The production is one cohesive dance solo comprised of 4 seemlessly
integrated sections that involves interactions between the soloist and
multiple dance models.

- Section 1: This beginning section is completely choreographed by me
  without any programmatic guidance, for the soloist to set the scene.

- Section 2: This section begins with text-to-speech in the sound score
  utilizing Google Text-to-Speech (gTTS) and Python. The Java
  [`Generator.java`](./solo_choreo_gen/Generator.java) program
  randomizes and drives a couple choreographic constraints for the
  soloist.

- Section 3: This section also begins with text-to-speech in the sound
  score utilizing Google Text-to-Speech (gTTS) and Python. The dance
  soloist begins to interact on-stage media technology in order to
  record the models on stage. The choreography for the models is mostly
  randomized and dictated by the Java
  [`GeneratorAll.java`](./choreo_gen/GeneratorAll.java) program.

- Section 4: This final section begins again with text-to-speech in the
  sound score utilizing Google Text-to-Speech (gTTS) and Python. The
  Java
  [`EndChoreoGenerator.java`](./solo_choreo_gen/EndChoreoGenerator.java)
  program randomizes and drives more choreographic constraints for the
  soloist.
