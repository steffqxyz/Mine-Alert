package io.github.dougcodez.minealert.file;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class WorldsFile extends AbstractFile{

    @Override
    public void registerFile() {
        createFile("worlds.yml");
        setData();
        saveFile();
    }

    @Override
    public void setData() {
        if(isFileNotEmpty()) return;
        final FileConfiguration configuration = getFileConfiguration();
        configuration.set("worlds", List.of("example_world"));
        configuration.setComments("worlds", List.of("Enter the worlds where you want alerts to be disabled!"));
    }
}
