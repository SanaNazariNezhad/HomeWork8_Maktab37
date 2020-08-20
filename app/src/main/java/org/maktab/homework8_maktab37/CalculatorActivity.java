package org.maktab.homework8_maktab37;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    public static final String BUNDLE_KEY_NUMBER1 = "number1";
    public static final String BUNDLE_KEY_NUMBER2 = "number2";
    public static final String BUNDLE_KEY_TEXT_VIEW_RESULT = "textViewResult";
    public static final String BUNDLE_KEY_TEXT_VIEW_SHOW_VALUE = "textViewShowValue";
    private static final String TAG = "CalculatorActivity";
    public static final String BUNDLE_KEY_FLAG_ADD = "flag_add";
    public static final String BUNDLE_KEY_FLAG_SUB = "flag_sub";
    public static final String BUNDLE_KEY_FLAG_MULTIPLY = "flag_multiply";
    public static final String BUNDLE_KEY_FLAG_DIVIDE = "flag_divide";
    public static final String BUNDLE_KEY_MEMORY = "memory";
    public static final String BUNDLE_KEY_SHOW_VALUE = "showValue";
    private TextView mTextViewResult, mTextViewShowValue;
    private Button mButtonDelete, mButtonDot;
    private ImageButton mImageButtonAdd, mImageButtonSub, mImageButtonMultiply, mImageButtonDivide,
            mImageButtonEqual;
    private ImageButton mImageButton0, mImageButton1, mImageButton2, mImageButton3, mImageButton4,
            mImageButton5, mImageButton6, mImageButton7, mImageButton8, mImageButton9;
    private boolean mFlagAdd, mFlagSub, mFlagMultiply, mFlagDivide;
    private float mNumber1, mNumber2;
    private String mResult = "";
    private String mShow = "";
    private String mShowValue = "";
    private String mMemory = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mNumber1 = savedInstanceState.getFloat(BUNDLE_KEY_NUMBER1);
            mNumber2 = savedInstanceState.getFloat(BUNDLE_KEY_NUMBER2);
            mResult = savedInstanceState.getString(BUNDLE_KEY_TEXT_VIEW_RESULT);
            mShow = savedInstanceState.getString(BUNDLE_KEY_TEXT_VIEW_SHOW_VALUE);
            mFlagAdd = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_ADD);
            mFlagSub = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_SUB);
            mFlagMultiply = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_MULTIPLY);
            mFlagDivide = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_DIVIDE);
            mMemory = savedInstanceState.getString(BUNDLE_KEY_MEMORY);
            mShowValue = savedInstanceState.getString(BUNDLE_KEY_SHOW_VALUE);
        } else
            Log.d(TAG, "savedInstanceState is NULL!!");

        setContentView(R.layout.activity_calculator);

        setTitle(R.string.title);
        findViews();
        mTextViewResult.setText(mResult);
        mTextViewShowValue.setText(mShow);
        listeners();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(BUNDLE_KEY_NUMBER1, mNumber1);
        outState.putFloat(BUNDLE_KEY_NUMBER2, mNumber2);
        outState.putString(BUNDLE_KEY_TEXT_VIEW_RESULT, mTextViewResult.getText().toString());
        outState.putString(BUNDLE_KEY_TEXT_VIEW_SHOW_VALUE, mTextViewShowValue.getText().toString());
        outState.putBoolean(BUNDLE_KEY_FLAG_ADD, mFlagAdd);
        outState.putBoolean(BUNDLE_KEY_FLAG_SUB, mFlagSub);
        outState.putBoolean(BUNDLE_KEY_FLAG_MULTIPLY, mFlagMultiply);
        outState.putBoolean(BUNDLE_KEY_FLAG_DIVIDE, mFlagDivide);
        outState.putString(BUNDLE_KEY_MEMORY,mMemory);
        outState.putString(BUNDLE_KEY_SHOW_VALUE,mShowValue);
    }

    private void listeners() {
        mImageButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "0";
                mShowValue += "0";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.zero, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "1";
                mShowValue += "1";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.one, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "2";
                mShowValue += "2";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.two, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "3";
                mShowValue += "3";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.three, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "4";
                mShowValue += "4";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.four, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "5";
                mShowValue += "5";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.five, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "6";
                mShowValue += "6";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.six, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "7";
                mShowValue += "7";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.seven, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "8";
                mShowValue += "8";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.eight, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMemory += "9";
                mShowValue += "9";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.nine, R.color.blueGrey, Gravity.TOP, 16).show();
            }
        });
        mImageButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.add, R.color.blueGrey, Gravity.TOP, 16).show();
                if (mMemory == null)
                    mMemory = "";
                if (mShowValue.contains("=")) {
                    mShowValue = mMemory;
                    mShowValue += "+";
                    mTextViewShowValue.setText(mShowValue);
                } else {
                    mShowValue += "+";
                    mTextViewShowValue.setText(mShowValue);
                }
                mNumber1 = Float.parseFloat(mMemory);
                mFlagAdd = true;
                mMemory = "";

            }
        });
        mImageButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.sub, R.color.blueGrey, Gravity.TOP, 16).show();
                if (mShowValue.contains("=")) {
                    mShowValue = mMemory;
                    mShowValue += "-";
                    mTextViewShowValue.setText(mShowValue);
                } else {
                    mShowValue += "-";
                    mTextViewShowValue.setText(mShowValue);
                }
                mNumber1 = Float.parseFloat(mMemory);
                mFlagSub = true;
                mMemory = "";

            }
        });
        mImageButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.multiply, R.color.blueGrey, Gravity.TOP, 16).show();
                if (mShowValue.contains("=")) {
                    mShowValue = mMemory;
                    mShowValue += "*";
                    mTextViewShowValue.setText(mShowValue);
                } else {
                    mShowValue += "*";
                    mTextViewShowValue.setText(mShowValue);
                }
                mNumber1 = Float.parseFloat(mMemory);
                mFlagMultiply = true;
                mMemory = "";

            }
        });
        mImageButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.divide, R.color.blueGrey, Gravity.TOP, 16).show();
                if (mShowValue.contains("=")) {
                    mShowValue = mMemory;
                    mShowValue += "/";
                    mTextViewShowValue.setText(mShowValue);
                } else {
                    mShowValue += "/";
                    mTextViewShowValue.setText(mShowValue);
                }
                mNumber1 = Float.parseFloat(mMemory);
                mFlagDivide = true;
                mMemory = "";

            }
        });
        mButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mShowValue = "";
                mMemory = "";
                mTextViewShowValue.setText(mShowValue);
                callToast(R.string.delete, R.color.blueGrey, Gravity.TOP, 16).show();
                mTextViewResult.setText("");
            }
        });
        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mShowValue.contains("=")) {
                    mMemory = "0";
                    mShowValue = mMemory;
                    mShowValue += ".";
                    mTextViewShowValue.setText(mShowValue);
                } else {
                    mShowValue += ".";
                    mTextViewShowValue.setText(mShowValue);
                }
                callToast(R.string.dot, R.color.blueGrey, Gravity.TOP, 16).show();
                mMemory += ".";
            }
        });
        mImageButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.equal, R.color.blueGrey, Gravity.TOP, 16).show();
                mNumber2 = Float.parseFloat(mMemory);
                mShowValue += "=";
                mTextViewShowValue.setText(mShowValue);

                if (mFlagAdd) {
                    mTextViewResult.setText(mNumber1 + mNumber2 + "");
                    float result = mNumber1 + mNumber2;
                    mMemory = result + "";
                    mFlagAdd = false;
                } else if (mFlagSub) {
                    mTextViewResult.setText(mNumber1 - mNumber2 + "");
                    float result = mNumber1 - mNumber2;
                    mMemory = result + "";
                    mFlagSub = false;
                } else if (mFlagMultiply) {
                    mTextViewResult.setText(mNumber1 * mNumber2 + "");
                    float result = mNumber1 * mNumber2;
                    mMemory = result + "";
                    mFlagMultiply = false;
                } else if (mFlagDivide) {
                    if (mNumber1 == 0 && mNumber2 == 0)
                        mTextViewResult.setText(R.string.result_is_undefined);
                    else if (mNumber2 == 0)
                        mTextViewResult.setText(R.string.cannot_divide_by_zero);
                    else {
                        mTextViewResult.setText(mNumber1 / mNumber2 + "");
                        float result = mNumber1 / mNumber2;
                        mMemory = result + "";
                    }
                    mFlagDivide = false;
                }
            }
        });

    }

    private void findViews() {
        mTextViewResult = findViewById(R.id.textViewResult);
        mButtonDelete = findViewById(R.id.btnDelete);
        mButtonDot = findViewById(R.id.btnDot);
        mImageButtonAdd = findViewById(R.id.imageBtnAdd);
        mImageButtonSub = findViewById(R.id.imageBtnSub);
        mImageButtonMultiply = findViewById(R.id.imageBtnMultiply);
        mImageButtonDivide = findViewById(R.id.imageBtnDivide);
        mImageButtonEqual = findViewById(R.id.imageBtnEqual);
        mImageButton0 = findViewById(R.id.imageBtn0);
        mImageButton1 = findViewById(R.id.imageBtn1);
        mImageButton2 = findViewById(R.id.imageBtn2);
        mImageButton3 = findViewById(R.id.imageBtn3);
        mImageButton4 = findViewById(R.id.imageBtn4);
        mImageButton5 = findViewById(R.id.imageBtn5);
        mImageButton6 = findViewById(R.id.imageBtn6);
        mImageButton7 = findViewById(R.id.imageBtn7);
        mImageButton8 = findViewById(R.id.imageBtn8);
        mImageButton9 = findViewById(R.id.imageBtn9);
        mTextViewShowValue = findViewById(R.id.show_values);
    }

    private Toast callToast(int stringRes, int colorRes, int gravity, float size) {
        Toast toast;

        toast = Toast.makeText(CalculatorActivity.this, stringRes, Toast.LENGTH_SHORT);
        toast.getView().setBackgroundColor(getResources().getColor(colorRes));
        TextView toastMessage = toast.getView().findViewById(android.R.id.message);
        toastMessage.setTextColor(Color.GREEN);
        toastMessage.setTextSize(size);
        toast.setGravity(gravity, 0, 120);


        return toast;

    }
}