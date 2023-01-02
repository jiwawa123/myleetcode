package com.ji.algo.L2501_2550;

/**
 * @Author: Bei Chang
 * @Date: 2023/01/02/上午8:57
 */
public class L2515 {
    public static void main(String[] args) {
        String[] arr = {"lwgdugypkmsvxwhwbrccrbtemvudwhctnaaonednsbodptendi", "lumylagwxpmmivpujfawgvdbtxpluwekdpeakrqelpvrflnsnr",
                "lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj", "nabbqiyarxmzleesxrfaynypfxonyhvwhebfjsxyinepggxnns",
                "oiqghjtvrhpgvsjlzmrwbwpmomqqliqytdzawhkwematskflgf", "dtiwjpdgcsmhaiwxrgligxlibfmvclobjjhljrqlvpuiufskix",
                "svqgvooghuqszkrmcrayqclotygdqnxfetdrfrfvbypgiizzdk", "qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw",
                "ihaekjyxvnmhvtanysybyqvrtmffpkgmnxisgmmhkhbtonlwgo", "ucrvwdlifpckbimcvevgsniepuewjqpakwnxksumgvrnmhmtuk",
                "lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj", "lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj", "vdtvcclyyraevotgikgojlbefpfmlzypychxehnglgettackoz", "qxspwpzxfxyxalrjuliwtbyllamkifbknnhzyfeabavwvvdkzk", "vdtvcclyyraevotgikgojlbefpfmlzypychxehnglgettackoz", "ucrvwdlifpckbimcvevgsniepuewjqpakwnxksumgvrnmhmtuk", "dtiwjpdgcsmhaiwxrgligxlibfmvclobjjhljrqlvpuiufskix", "vtbfahotrkxwcfwzlijfoqdkrvdmavpllbcfvibrqeuntsmrcs", "mfhqksxfeeltpiupaijavavbpphjxyuzqlqehirxnmviiaqnfv", "oowbnwbktlmsawtbilyvksqkbuohhjxqbepxgklkrwpjzcvipe", "mpnnvwuqbczvmrwhzvsmtuumwjczqehuumjvfbpgoxlurjbckq", "byaschxhjcgnnodazzpisqriyszffaqqiwljbuigdvzzobrlmc", "dmctcimgeztojrvqwyygmnzfwtsrmmbgednmytsludnrpjjjvk", "qxspwpzxfxyxalrjuliwtbyllamkifbknnhzyfeabavwvvdkzk", "cawzflwjjopbemxqazpsrsrlxljwqlvzpvjbjarqeqgythrsou", "ydqjqvalipkkrcbdprgjjangclswdjpaajiwhxeupidxirlith", "lwgdugypkmsvxwhwbrccrbtemvudwhctnaaonednsbodptendi", "ejtkmbyqtwrlhwynnqggpjaaaydjqnczhtyphfgugpbardzlvj", "cawzflwjjopbemxqazpsrsrlxljwqlvzpvjbjarqeqgythrsou", "oowbnwbktlmsawtbilyvksqkbuohhjxqbepxgklkrwpjzcvipe", "khhwlijglujhgimvfvuwgggigppichzscdtsiklalgqeqsencq", "khhwlijglujhgimvfvuwgggigppichzscdtsiklalgqeqsencq", "lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj", "frdsoraagsllmgtatzybegxotrtgsuwfzpzxkpegggvpodnhrr", "ynuartuisymsqxxdqwndonpqhczqpuekwbayfidfisjpriqogx", "shmpixycafoqskoegqfvsrvboiegqwlbrkiuoeetncdxqlqsov", "oiqghjtvrhpgvsjlzmrwbwpmomqqliqytdzawhkwematskflgf", "xjtatoefvpwwgsvmepltadmzngxtnahqypfxgjppbqsmqnjvxm", "vtbfahotrkxwcfwzlijfoqdkrvdmavpllbcfvibrqeuntsmrcs", "dmctcimgeztojrvqwyygmnzfwtsrmmbgednmytsludnrpjjjvk", "dsohnrdxdqrbwdjhqpphwvlzfyizqyoedckthdlhmkxjxewubc", "qriythowwswwwucgwmezpqqneatemdxfqzpeytlozzojguywby", "lyhmqyjnztwzqotqkpmvpueyzjfroousgkkerqvmwjnjtmlkuf", "qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw", "qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw", "gxrtwoayoosijaddrlbvxqsvbbvaziqemcpxgljlnexvjnnakk", "mjftbskulmuztejkopyftjsdeoyuvhvqragbkqlfhgqqkafvau", "mjftbskulmuztejkopyftjsdeoyuvhvqragbkqlfhgqqkafvau", "qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw", "qxspwpzxfxyxalrjuliwtbyllamkifbknnhzyfeabavwvvdkzk"};
        System.out.println(closetTarget(arr, "ydqjqvalipkkrcbdprgjjangclswdjpaajiwhxeupidxirlith", 0));
    }

    public static int closetTarget(String[] words, String target, int startIndex) {
        int left = startIndex, right = startIndex;
        int len = 0;
        while (len < (words.length / 2 + 1)) {
            if (words[left].equals(target) ||
                    words[right].equals(target)) {
                return len;
            }
            len++;
            left--;
            right++;
            if (left < 0) {
                left = words.length - 1;
            }
            if (right >= words.length) {
                right = 0;
            }
        }
        return -1;
    }
}
