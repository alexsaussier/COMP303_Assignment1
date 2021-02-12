# COMP303_Assignment1
My solution to assignment 1 of COMP 303 (Software Design). Taken if Winter 2021 with Pr. Jin Guo.

The assignment's requirements:

Following the principles seen in Chapter 2 of the book, design and write the code necessary to support a movie library with the following properties.

A library is made up of movies and watchlists. Each movie corresponds to a specific file path, which can never change once the movie object is created. The client should be able to know the video format of a movie, which is determined by the extension of the file path. Video formats must be one of MP4, MOV, WMV, AVI, FLV, or MKV. It should not possible to create a movie object with a format other than those mentioned. A movie can become "invalid" if the underlying file disappears. During its lifetime, a movie can become invalid and valid again if the underlying file is deleted or restored. [5 points]

A movie object captures information about the movie. There are two types of information elements: required and custom. Required information includes the title, language, and publishing studio. Custom information is information in the format of key-value pairs that can be specified by the client. The value of the custom information can change during the lifetime of a movie object. [5 points]

Movies can be organized into watchlists. A watchlist contains a sequence of movies that the user wants to watch. A watchlist is identified by a name, which can be changed after the watchlist is created. It should be possible to remove the first movie from the watchlist (e.g., after the movie is played). It should also be possible for a client to access all the movies in the watch list, as well as easily get information about the watchlist: the number of valid movies and the list of all publishing studios and languages without duplicates. [5 points]
