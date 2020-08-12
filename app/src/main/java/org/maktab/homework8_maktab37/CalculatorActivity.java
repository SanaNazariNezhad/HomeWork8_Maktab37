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
    private static final String TAG = "CalculatorActivity";
    public static final String BUNDLE_KEY_FLAG_ADD = "flag_add";
    public static final String BUNDLE_KEY_FLAG_SUB = "flag_sub";
    public static final String BUNDLE_KEY_FLAG_MULTIPLY = "flag_multiply";
    public static final String BUNDLE_KEY_FLAG_DIVIDE = "flag_divide";
    private TextView mTextViewResult;
    private Button mButtonDelete, mButtonDot;
    private ImageButton mImageButtonAdd, mImageButtonSub, mImageButtonMultiply, mImageButtonDivide,
            mImageButtonEqual;
    private ImageButton mImageButton0, mImageButton1, mImageButton2, mImageButton3, mImageButton4,
            mImageButton5, mImageButton6, mImageButton7, mImageButton8, mImageButton9;
    private boolean mFlagAdd, mFlagSub, mFlagMultiply, mFlagDivide;
    private float mNumber1, mNumber2;
    private String mResult="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState!=null){
            mNumber1 = savedInstanceState.getFloat(BUNDLE_KEY_NUMBER1);
            mNumber2 = savedInstanceState.getFloat(BUNDLE_KEY_NUMBER2);
            mResult = savedInstanceState.getString(BUNDLE_KEY_TEXT_VIEW_RESULT);
            mFlagAdd = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_ADD);
            mFlagSub = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_SUB);
            mFlagMultiply = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_MULTIPLY);
            mFlagDivide = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_DIVIDE);
        }else
            Log.d(TAG, "savedInstanceState is NULL!!");

        setContentView(R.layout.activity_calculator);

        findViews();
        mTextViewResult.setText(mResult);
        listeners();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(BUNDLE_KEY_NUMBER1,mNumber1);
        outState.putFloat(BUNDLE_KEY_NUMBER2,mNumber2);
        outState.putString(BUNDLE_KEY_TEXT_VIEW_RESULT, mTextViewResult.getText().toString());
        outState.putBoolean(BUNDLE_KEY_FLAG_ADD,mFlagAdd);
        outState.putBoolean(BUNDLE_KEY_FLAG_SUB,mFlagSub);
        outState.putBoolean(BUNDLE_KEY_FLAG_MULTIPLY,mFlagMultiply);
        outState.putBoolean(BUNDLE_KEY_FLAG_DIVIDE,mFlagDivide);
    }

    private void listeners() {
        mImageButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "0");
                callToast(R.string.zero,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "1");
                callToast(R.string.one,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "2");
                callToast(R.string.two,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "3");
                callToast(R.string.three,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "4");
                callToast(R.string.four,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "5");
                callToast(R.string.five,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "6");
                callToast(R.string.six,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "7");
                callToast(R.string.seven,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "8");
                callToast(R.string.eight,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "9");
                callToast(R.string.nine,R.color.blueGrey, Gravity.TOP,16).show();
            }
        });
        mImageButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.add,R.color.blueGrey, Gravity.TOP,16).show();
                if (mTextViewResult == null)
                    mTextViewResult.setText("");
                else {
                    mNumber1 = Float.parseFloat(mTextViewResult.getText() + "");
                    mFlagAdd = true;
                    mTextViewResult.setText(null);
                }
            }
        });
        mImageButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.sub,R.color.blueGrey, Gravity.TOP,16).show();
                mNumber1 = Float.parseFloat(mTextViewResult.getText() + "");
                mFlagSub = true;
                mTextViewResult.setText(null);

            }
        });
        mImageButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.multiply,R.color.blueGrey, Gravity.TOP,16).show();
                mNumber1 = Float.parseFloat(mTextViewResult.getText() + "");
                mFlagMultiply = true;
                mTextViewResult.setText(null);

            }
        });
        mImageButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.divide,R.color.blueGrey, Gravity.TOP,16).show();
                mNumber1 = Float.parseFloat(mTextViewResult.getText() + "");
                mFlagDivide = true;
                mTextViewResult.setText(null);

            }
        });
        mButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.delete,R.color.blueGrey, Gravity.TOP,16).show();
                mTextViewResult.setText("");
            }
        });
        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.dot,R.color.blueGrey, Gravity.TOP,16).show();
                mTextViewResult.setText(mTextViewResult.getText() + ".");
            }
        });
        mImageButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast(R.string.equal,R.color.blueGrey, Gravity.TOP,16).show();
                mNumber2 = Float.parseFloat(mTextViewResult.getText() + "");

                if (mFlagAdd){
                    mTextViewResult.setText(mNumber1 + mNumber2 + "");
                    mFlagAdd = false;
                }else if (mFlagSub){
                    mTextViewResult.setText(mNumber1 - mNumber2 + "");
                    mFlagSub = false;
                }else if (mFlagMultiply){
                    mTextViewResult.setText(mNumber1 * mNumber2 + "");
                    mFlagMultiply = false;
                }else if (mFlagDivide){
                    if (mNumber1==0 && mNumber2==0)
                        mTextViewResult.setText(R.string.result_is_undefined);
                    else if (mNumber2 == 0)
                        mTextViewResult.setText(R.string.cannot_divide_by_zero);
                    else
                        mTextViewResult.setText(mNumber1 / mNumber2 + "");
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