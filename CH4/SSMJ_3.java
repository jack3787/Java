class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song() {}; // 기본 생성자

    public Song(int y, String country, String artist, String title) {
        year = y;
        this.country = country;
        this.artist = artist;
        this.title = title;
    }

    void show3(){
        System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}

public class SSMJ_3 {
    public static void main(String[] args){
        Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
        song.show3();
    }
} 
