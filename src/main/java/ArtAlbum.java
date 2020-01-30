public class ArtAlbum extends Book {
    private String paperQuality;

    public ArtAlbum(String name, int numOfPages, String paperQuality) {
        super(name, numOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "ArtAlbum{" +
                "paperQuality='" + paperQuality + '\'' +
                '}';
    }
}

