package com.yalantis.fitfilter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

import com.yalantis.filter.model.FilterModel;

import org.jetbrains.annotations.NotNull;

/**
 * Created by galata on 16.09.16.
 */
public class Tag implements FilterModel {
    private String text;
    private int color;
    private int icon;

    public Tag(String text, int color, int icon) {
        this.text = text;
        this.color = color;
        this.icon = icon;
    }

    @NonNull
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag)) return false;

        Tag tag = (Tag) o;

        if (getColor() != tag.getColor()) return false;
        return getText().equals(tag.getText());

    }

    @Override
    public int hashCode() {
        int result = getText().hashCode();
        result = 31 * result + getColor();
        return result;
    }

    @NotNull
    @Override
    public int getIcon() {
        return this.icon;
    }
}
