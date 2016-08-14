#/usr/bin/python
word=str(raw_input('enter a word: '))
def anti_vowel(text):
    vowels='ioeua'
    new_text=''
    for i in text:
        if i.lower() not in vowels:
           new_text+=i
    print new_text
    return new_text
anti_vowel(word)

    
