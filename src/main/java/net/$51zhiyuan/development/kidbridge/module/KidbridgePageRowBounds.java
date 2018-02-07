package net.$51zhiyuan.development.kidbridge.module;

import com.github.pagehelper.PageRowBounds;

public class KidbridgePageRowBounds extends PageRowBounds {

    public KidbridgePageRowBounds(Integer offset, Integer limit) {
        super(offset == null ? 0 : offset.intValue(), limit == null || limit.intValue() > 20 ? 20 : limit.intValue());
    }
}
