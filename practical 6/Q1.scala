object CeasarCipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val shift = (scala.io.StdIn.readLine("Shift by: ").toInt + alphabet.size) % alphabet.size

	val inputText = scala.io.StdIn.readLine("Enter the code which you want to encrypt or decrypt: ")

	val outputText = (shift:Int)=>inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)

		if (x == -1) c

		else alphabet((x + shift) % alphabet.size)
	});

	println("Enter 1-to encrypt message");
	println("Enter 2-to decrypt message");
	val n=scala.io.StdIn.readInt()

	if(n==1) println("Encrypted message: "+ outputText(shift))	

	else println("Decrypted message: "+ outputText(-shift))
}