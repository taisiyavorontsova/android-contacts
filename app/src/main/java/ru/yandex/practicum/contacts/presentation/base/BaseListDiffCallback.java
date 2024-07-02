package ru.yandex.practicum.contacts.presentation.base;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

public class BaseListDiffCallback <T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>{
    boolean theSameAs(BaseListDiffCallback other){
        return false;
    }

    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public boolean areItemsTheSame(@NonNull T t, @NonNull T t1) {
        return false;
    }

    public boolean areContentsTheSame(T oldItem, T newItem) {
        return oldItem.equals(newItem);
    }
    public Object getChangePayload(T oldItem, T newItem) {
        return newItem;
    }

}
