import java.util.ArrayList;

public class Counting {
    public static void main(String args[])
    {
        // character array
        // letters = "abcdefghijklmnopqrstuvwxyz., ABCDEFGHIJKLMNOPQRSTUVWXYZ "


        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        int[] count = new int[255];

        int length = text.length();

        for (int i = 0; i < length; i++) {
            count[text.charAt(i)]++;
        }

        char[] ch = new char[text.length()];
        for (int i = 0; i < length; i++) {
            ch[i] = text.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (text.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1) {
                System.out.println(text.charAt(i) + " :" + count[text.charAt(i)]);
            }

        }
    }
}


/* Python Code
def count_letters(string):
    #string = string.lower()
    letters = "abcdefghijklmnopqrstuvwxyz., ABCDEFGHIJKLMNOPQRSTUVWXYZ "
    letter_dict = {}
    #letter_count = 0
    for each_char in string:
        if each_char in letters:
            if each_char in letter_dict:
                letter_dict[each_char] = letter_dict[each_char] + 1
            else:
                letter_dict[each_char] = 1

    keys = letter_dict.keys()
    #keys.sort()
    for each_char in keys:
        print(each_char, letter_dict[each_char])

    #return letter_dict

def main():
    input_string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus."
    count_letters(input_string)

if __name__ == "__main__":
    main()


 */