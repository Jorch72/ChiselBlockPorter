package team.chisel.porter;

import java.util.List;

public class BlockData {

    public String name;

    public List<BlockVariation> variations;

    public BlockData(String name, List<BlockVariation> variations) {
        this.name = name;
        this.variations = variations;
    }

    @Override
    public String toString() {
        return "BlockData [name=" + name + ", variations=" + variations + "]";
    }
}
