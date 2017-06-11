package im.getsocial.calc;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity
{
	private EditText arg1, arg2;
	private Button addition, subtraction, multiplication, division;
	private TextView result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		LinearLayout linearLayout = new LinearLayout(this);
		linearLayout.setLayoutParams(layoutParams);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
			
			arg1 = new EditText(this);
			arg1.setLayoutParams(layoutParams);
			arg1.setInputType(InputType.TYPE_CLASS_NUMBER);
			arg1.setContentDescription("arg1");
			arg1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
			arg1.setHint("First argument");
			linearLayout.addView(arg1);
			
			arg2 = new EditText(this);
			arg2.setLayoutParams(layoutParams);
			arg2.setInputType(InputType.TYPE_CLASS_NUMBER);
			arg2.setContentDescription("arg2");
			arg2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
			arg2.setHint("Second argument");
			linearLayout.addView(arg2);
			
			LinearLayout operationsLinearLayout = new LinearLayout(this);
			operationsLinearLayout.setLayoutParams(layoutParams);
			operationsLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
				
				layoutParams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT);
				layoutParams.weight = 1;
				addition = new Button(this);
				addition.setLayoutParams(layoutParams);
				addition.setText("+");
				addition.setOnClickListener(addition());
				addition.setContentDescription("addition");
				addition.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
				operationsLinearLayout.addView(addition);
				
				subtraction = new Button(this);
				subtraction.setLayoutParams(layoutParams);
				subtraction.setText("-");
				subtraction.setOnClickListener(subtraction());
				subtraction.setContentDescription("subtraction");
				subtraction.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
				operationsLinearLayout.addView(subtraction);
				
				multiplication = new Button(this);
				multiplication.setLayoutParams(layoutParams);
				multiplication.setText("*");
				multiplication.setOnClickListener(multiplication());
				multiplication.setContentDescription("multiplication");
				multiplication.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
				operationsLinearLayout.addView(multiplication);
				
				division = new Button(this);
				division.setLayoutParams(layoutParams);
				division.setText("/");
				division.setOnClickListener(division());
				division.setContentDescription("division");
				division.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
				operationsLinearLayout.addView(division);
				
			linearLayout.addView(operationsLinearLayout);
			
			layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
			result = new TextView(this);
			result.setLayoutParams(layoutParams);
			result.setEnabled(false);
			result.setContentDescription("result");
			result.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
			result.setHint("Result");
			linearLayout.addView(result);
			
		layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
		setContentView(linearLayout, layoutParams);
	}
	
	private long getArg1()
	{
		return Long.valueOf(arg1.getText().toString());
	}
	
	private long getArg2()
	{
		return Long.valueOf(arg2.getText().toString());
	}
	
	private View.OnClickListener addition()
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				result.setText("" + (getArg1() + getArg2()));
			}
		};
	}
	
	private View.OnClickListener subtraction()
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				result.setText("" + (getArg1() - getArg2()));
			}
		};
	}
	
	private View.OnClickListener multiplication()
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				result.setText("" + (getArg1() * getArg2()));
			}
		};
	}
	
	private View.OnClickListener division()
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				result.setText("" + (getArg1() / getArg2()));
			}
		};
	}
}
