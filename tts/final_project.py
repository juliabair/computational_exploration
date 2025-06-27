# Julia Bair

import gtts
from playsound import playsound


def main():
    lang = 1

    while True:
        try:
            file = input(
                "What text file would you like to convert from text to speech? "
            )
            infile = open(file, "r")
            lines = infile.read()
            infile.close()

            print(
                "If the file you wish to convert from text to speech is in either English, Spanish, French, or Italian:"
            )
            lang = int(
                input(
                    "Choose 1: English, 2: Spanish, 3: French, 4: Italian, 5: English with a British Accent: "
                )
            )

            if lang == 1:
                txt_to_speech(lines)
            elif lang == 2:
                spanish_tts(lines)
            elif lang == 3:
                french_tts(lines)
            elif lang == 4:
                italian_tts(lines)
            elif lang == 5:
                accent_tts(lines)
            else:
                print("Please enter either 1, 2, 3, 4, 5.")

            another = input("Would you like to convert another file? (y or n): ")
            if another == "n":
                break

        except FileNotFoundError:
            print("Please enter a valid file name.")
        except ValueError:
            print("Please enter a valid option.")


def txt_to_speech(lines):
    tts = gtts.gTTS(lines)
    tts.save("outfile.mp3")
    playsound("outfile.mp3")


def accent_tts(lines):
    tts = gtts.gTTS(lines, lang="en", tld="co.uk")
    tts.save("outfile.mp3")
    playsound("outfile.mp3")


def spanish_tts(lines):
    tts = gtts.gTTS(lines, lang="es")
    tts.save("outfile.mp3")
    playsound("outfile.mp3")


def french_tts(lines):
    tts = gtts.gTTS(lines, lang="fr")
    tts.save("outfile.mp3")
    playsound("outfile.mp3")


def italian_tts(lines):
    tts = gtts.gTTS(lines, lang="it")
    tts.save("outfile.mp3")
    playsound("outfile.mp3")


main()
