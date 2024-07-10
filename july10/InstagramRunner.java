public class InstagramRunner{

        public static void main(String args[]){
        System.out.println(Instagram.insta());
        System.out.println(Instagram.insta(12345678));
        System.out.println(Instagram.insta(12345678,500));
        System.out.println(Instagram.insta(12345678,500,"Private"));
        System.out.println(Instagram.insta(12345678,500,"Private",45));
        System.out.println(Instagram.insta(12345678,500,"Private",45,true));
        System.out.println(Instagram.insta(12345678,500,"Private",45,true,"Active"));
        System.out.println(Instagram.insta(12345678,500,"Private",45,true,"Active",800));
        System.out.println(Instagram.insta(12345678,500,"Private",45,true,"Active",800,"Meta"));
        System.out.println(Instagram.insta(12345678,500,"Private",45,true,"Active",800,"Meta",true));
        }
}