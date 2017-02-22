public class CaesarCipher
{


    public static String encrypt(String str, int length, int shift)
    {
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < length; i++)
        {
            c = str.charAt(i);

            if (Character.isLetter(c))
            {
                c = (char) (str.charAt(i) + shift);

                if ((Character.isLowerCase(str.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(str.charAt(i)) && c > 'Z'))

                    c = (char) (str.charAt(i) - (26 - shift));
            }
            strBuilder.append(c);
        }
        return strBuilder.toString();
    }
}
