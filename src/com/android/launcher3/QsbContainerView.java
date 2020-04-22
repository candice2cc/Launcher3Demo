/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.launcher3;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * A frame layout which contains a QSB. This internally uses fragment to bind the view, which
 * allows it to contain the logic for {@link Fragment#startActivityForResult(Intent, int)}.
 */
public class QsbContainerView extends FrameLayout {

    public QsbContainerView(Context context) {
        super(context);
    }

    public QsbContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QsbContainerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(0, 0, 0, 0);
    }

    /**
     * A fragment to display the QSB.
     */
    public static class QsbFragment extends Fragment implements View.OnClickListener {


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        private FrameLayout mWrapper;

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            mWrapper = new FrameLayout(getActivity());
            mWrapper.addView(getDefaultView(inflater, container));
            return mWrapper;
        }


        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn_qsb_search) {
//                getActivity().startSearch("", false, null, true);
            }
        }

        private View getDefaultView(LayoutInflater inflater, ViewGroup parent) {
            View v = inflater.inflate(R.layout.qsb_default_view, parent, false);
            v.findViewById(R.id.btn_qsb_search).setOnClickListener(this);
            return v;
        }
    }
}
