package com.example.zweng4.top_10_downloader;

/**
 * Created by zweng on 3/26/2016.
 */
public class Application {
    private String name;
    private String artist;
    private String releaseData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(String releaseData) {
        this.releaseData = releaseData;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\n"+
                "Artist: "+getArtist()+"\n"+
                "Release Date: "+getReleaseData()+"\n";
    }
}
