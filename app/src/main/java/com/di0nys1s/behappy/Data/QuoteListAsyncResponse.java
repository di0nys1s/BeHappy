package com.di0nys1s.behappy.Data;

import com.di0nys1s.behappy.Model.Quote;

import java.util.ArrayList;

public interface QuoteListAsyncResponse {
    void processFinished(ArrayList<Quote> quotes);
}
