
class grade {
    public static void main(String[] args) {

        char grade = 'A';   // original grade

        // Encrypt grade
        char encryptedGrade = (char)(grade + 8);
        System.out.println("Encrypted Grade: " + encryptedGrade);

        // Decrypt grade
        char decryptedGrade = (char)(encryptedGrade - 8);
        System.out.println("Decrypted Grade: " + decryptedGrade);

    }
}

