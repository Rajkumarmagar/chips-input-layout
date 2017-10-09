package com.tylersuehr.library;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/**
 * Copyright © 2017 Tyler Suehr
 *
 * Contains all the mutable properties for our {@link ChipsInputLayout}.
 *
 * @author Tyler Suehr
 * @version 1.0
 */
final class ChipOptions {
    /* Properties pertaining to ChipEditText */
    ColorStateList textColorHint;
    ColorStateList textColor;
    CharSequence hint;

    /* Properties pertaining to ChipView */
    ColorStateList chipDeleteIconColor;
    ColorStateList chipBackgroundColor;
    ColorStateList chipLabelColor;
    boolean hasAvatarIcon;
    boolean showDetailedChips = true;
    boolean chipDeletable = true;
    Drawable chipDeleteIcon;

    /* Properties pertaining to DetailedChipView */
    ColorStateList detailedChipDeleteIconColor;
    ColorStateList detailedChipBackgroundColor;
    ColorStateList detailedChipTextColor;

    /* Properties pertaining to FilterableRecyclerView */
    ColorStateList filterableListBackgroundColor;
    ColorStateList filterableListTextColor;

    /* Properties pertaining to the ChipsInputLayout itself */
    boolean allowCustomChips = true;
    int maxRows;


    ChipOptions(Context c, AttributeSet attrs) {
        TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.ChipsInputLayout);

        // Setup the properties for the ChipEditText
        this.textColorHint = a.getColorStateList(R.styleable.ChipsInputLayout_android_textColorHint);
        this.textColor = a.getColorStateList(R.styleable.ChipsInputLayout_android_textColor);
        this.hint = a.getString(R.styleable.ChipsInputLayout_android_hint);

        // Setup the properties for the ChipView
        this.chipDeleteIconColor = a.getColorStateList(R.styleable.ChipsInputLayout_chipDeleteIconColor);
        this.chipBackgroundColor = a.getColorStateList(R.styleable.ChipsInputLayout_chipBackgroundColor);
        this.chipLabelColor = a.getColorStateList(R.styleable.ChipsInputLayout_chipLabelColor);
        this.hasAvatarIcon = a.getBoolean(R.styleable.ChipsInputLayout_chipHasAvatarIcon, true);
        this.showDetailedChips = a.getBoolean(R.styleable.ChipsInputLayout_detailedChipsEnabled, true);
        this.chipDeletable = a.getBoolean(R.styleable.ChipsInputLayout_chipDeletable, true);
        this.chipDeleteIcon = a.getDrawable(R.styleable.ChipsInputLayout_chipDeleteIcon);

        // Setup the properties for the DetailedChipView
        this.detailedChipDeleteIconColor = a.getColorStateList(R.styleable.ChipsInputLayout_detailedDeleteIconColor);
        this.detailedChipBackgroundColor = a.getColorStateList(R.styleable.ChipsInputLayout_chipBackgroundColor);
        this.detailedChipTextColor = a.getColorStateList(R.styleable.ChipsInputLayout_detailedChipTextColor);

        // Setup the properties for the FilterableRecyclerView
        this.filterableListBackgroundColor = a.getColorStateList(R.styleable.ChipsInputLayout_filterableListBackgroundColor);
        this.filterableListTextColor = a.getColorStateList(R.styleable.ChipsInputLayout_filterableListTextColor);

        // Setup the properties for the ChipsInput itself
        this.allowCustomChips = a.getBoolean(R.styleable.ChipsInputLayout_customChipsEnabled, true);
        this.maxRows = a.getInt(R.styleable.ChipsInputLayout_maxRows, 3);

        a.recycle();
    }
}