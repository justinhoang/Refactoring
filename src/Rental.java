import util.DateRange;

class Rental {
    private Movie _movie;

    private int _daysRented;

    public Rental(Movie movie, DateRange dateRange) {
        _movie = movie;
        _daysRented = (int)((dateRange.getEnd().getTime() - dateRange.getStart().getTime()) / (1000 * 60 * 60 * 24));
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public String getTitle() {
        return _movie.getTitle();
    }
    
    public int getPriceCode() {
        return _movie.get_priceCode();
    }

    public void setMovie(Movie myMovie){
        this._movie = myMovie;
    }
    public Movie getMovie(){
        return _movie;
    }


}
