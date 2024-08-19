object  Caesar{
    
    def encrypt(text: String , shifter: Int): String = {
        text.map(c => (c + shifter).toChar)
    }

    def decrypt(text: String , shifter: Int): String = {
        text.map(c => (c - shifter).toChar)
    }

    def main(args: Array[String]): Unit={
        print("Enter a String: ")
        val text = scala.io.StdIn.readLine()
        println(s"Original Text : ${text}")
        val encrypted_text = encrypt(text , 2) 
        println(s"Encrypted Text : ${encrypted_text}")
        println(s"Decrypted Text : ${decrypt(encrypted_text , 2)}")
    }
}