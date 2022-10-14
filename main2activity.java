package multiplicar.app.android;


import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import 	android.view.InputEvent;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.app.Activity;
import android.os.Bundle;




import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import java.io.File;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.lang.Object;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;

import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.Exception;
import java.io.IOException;
import android.webkit.WebView;
import android.view.KeyEvent.Callback;
import java.lang.Object;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.Toast; 
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import 	android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.app.ListActivity;
import java.io.*;


import 	java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import android.util.Base64;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;







public class main2activity extends Activity 
{
	int nn;

	SQLiteDatabase db;
	Cursor cursor;
	private Button btn;
	
	private int iii;

	private Context context;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adicionar);
		
		//setTitle();
		context=this;

		btn = (Button) findViewById(R.id.add); 	
		

		final EditText ED = (EditText)findViewById(R.id.edata);

		final EditText ED2 = (EditText)findViewById(R.id.enome);
		


		btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("calcular");

					System.setProperty("multiplicars.app.android.multiplicar", ED.getText().toString().trim());

					System.setProperty("multiplicars.app.android.por", ED2.getText().toString().trim());
					


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});

	



		setTitle("multiplicar");
		ED.setText(System.getProperty("multiplicars.app.android.multiplicar"));

		ED2.setText(System.getProperty("multiplicars.app.android.por"));
		


	}


}



