def reverseWords(input):
    inputWords=input.split(" ")
    inputWords=inputWords[-1::-1]
    output=" ".join(inputWords)
    return output
