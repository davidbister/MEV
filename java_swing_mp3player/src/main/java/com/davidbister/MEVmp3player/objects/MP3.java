package com.davidbister.MEVmp3player.objects;

import com.davidbister.MEVmp3player.utils.FileUtils;

import java.io.Serializable;
import java.util.Objects;

public class MP3 implements Serializable {

    private String name;
    private String path;

    public MP3(String name, String path) {
        this.name = name;
        this.path = path;
    }

    //for correkt Object's Show by Add to Playlist 
    @Override
    public String toString() {
        return FileUtils.getFileNameWithoutExtension(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.path);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MP3 other = (MP3) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        return true;
    }
}
