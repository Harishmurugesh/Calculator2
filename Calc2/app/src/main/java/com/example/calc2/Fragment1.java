package com.example.calc2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    TextView n00,n0,npoint,nequal,n1,n2,n3,n4,n5,n6,n7,n8,n9,nplus,nminus,ndivide,nmultiply,npercent,nAC ,question;
    ImageView backSpace;
    Fragment1listener listener;
    String input = "" , output = "" , finalOutput = "";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_1, container, false);


        n00 = v.findViewById(R.id.text00);
        n0 = v.findViewById(R.id.text0);
        n1 = v.findViewById(R.id.text1);
        n2 = v.findViewById(R.id.text2);
        n3 = v.findViewById(R.id.text3);
        n4 = v.findViewById(R.id.text4);
        n5 = v.findViewById(R.id.text5);
        n6 = v.findViewById(R.id.text6);
        n7 = v.findViewById(R.id.text7);
        n8 = v.findViewById(R.id.text8);
        n9 = v.findViewById(R.id.text9);
        npoint = v.findViewById(R.id.textpoint);
        npercent = v.findViewById(R.id.textpercent);
        nplus = v.findViewById(R.id.textplus);
        nminus = v.findViewById(R.id.textminus);
        nmultiply = v.findViewById(R.id.textmultiply);
        ndivide = v.findViewById(R.id.textdivide);
        nAC = v.findViewById(R.id.textac);
        backSpace = v.findViewById(R.id.textback);
        nequal = v.findViewById(R.id.textequal);
        question = v.findViewById(R.id.question);



        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "1";
                question.setText(input);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "2";
                question.setText(input);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "3";
                question.setText(input);
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "4";
                question.setText(input);
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "5";
                question.setText(input);
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "6";
                question.setText(input);
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "7";
                question.setText(input);
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "8";
                question.setText(input);
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "9";
                question.setText(input);
            }
        });

        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "00";
                question.setText(input);
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = input + "0";
                question.setText(input);
            }
        });

        npoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {

                        input = input + ".";
                        question.setText(input);
                    }
                }
            }
        });

        nplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {
                        getAnswer();
                        input = input + "+";
                        question.setText(input);
                    }
                }
            }
        });

        nminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {
                        getAnswer();
                        input = input + "-";
                        question.setText(input);
                    }
                }
            }
        });

        nmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {
                        input = input + "*";
                        getAnswer();
                        question.setText(input);
                    }
                }
            }
        });

        ndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {
                        getAnswer();
                        input = input + "/";
                        question.setText(input);
                    }
                }
            }
        });

        npercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {
                        input = input + "%";
                        double d = Double.parseDouble(question.getText().toString()) / 100;
                        listener.sendResult1(String.valueOf(d));
                    }
                }
            }
        });

        nAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = question.getText().toString();
                input = "";
                output = "";
                question.setText("");
                listener.sendResult1("");
            }
        });

        backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = question.getText().toString();
                if(input.length()!=0) {
                    input = input.substring(0, input.length() - 1);
                    question.setText(input);
                }
            }
        });


        nequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() != 0) {
                    if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*' && input.charAt(input.length() - 1) != '/' && input.charAt(input.length() - 1) != '.') {

                        getAnswer();
                        question.setText(input);
                    }
                }

            }
        });

        return v;


    }



    private void getAnswer() {

        if(input.split("\\+").length==2){
            String numbers[] = input.split("\\+");
            try{
                double d = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                finalOutput = removepoint(output);
                listener.sendResult1(finalOutput);
                question.setText(finalOutput);
                input = finalOutput + "";

            }catch (Exception e){
                listener.sendResult1(e.getMessage().toString());
            }
        }

        if(input.split("\\-").length==2){
            String numbers[] = input.split("\\-");
            try{
                double d = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                finalOutput = removepoint(output);
                listener.sendResult1(finalOutput);
                question.setText(finalOutput);
                input = finalOutput + "";

            }catch (Exception e){
                listener.sendResult1(e.getMessage().toString());
            }
        }

        if(input.split("\\/").length==2){
            String numbers[] = input.split("\\/");
            try{
                double d = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                finalOutput = removepoint(output);
                listener.sendResult1(finalOutput);
                question.setText(finalOutput);
                input = finalOutput + "";

            }catch (Exception e){
                listener.sendResult1(e.getMessage().toString());
            }
        }

        if(input.split("\\*").length==2){
            String numbers[] = input.split("\\*");
            try{
                double d = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                finalOutput = removepoint(output);
                listener.sendResult1(finalOutput);
                question.setText(finalOutput);
                input = finalOutput + "";

            }catch (Exception e){
                listener.sendResult1(e.getMessage().toString());
            }
        }


    }


    private String removepoint(String number){
        String n[] = number.split("\\.");
        if(n.length > 1){
            if(n[1].equals("0")){
                number = n[0];
            }
        }
        return number;
    }


    interface Fragment1listener{
        void sendResult1(String string);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if(context instanceof Fragment1listener){
            listener = (Fragment1listener) context;
        }else{
            throw new RuntimeException(context.toString() + "imlement listener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }





}