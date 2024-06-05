import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhilatelistImplementation implements Philatelist {
    private ArrayList<PostStamp> stamps = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null) throw new IllegalArgumentException();
        if(postStamp.getName()==null) throw new IllegalArgumentException();
        if(postStamp.getName().isEmpty()) throw new IllegalArgumentException();

        stamps.add(postStamp);
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return stamps.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (int i = 0; i < stamps.size(); i++) {
            System.out.println(stamps.get(i).getName());
        }
       // stamps.stream().map(PostStamp::getName).forEach(System.out::println);
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        for (int i = 0; i < stamps.size(); i++) {
            if (stamps.get(i).getMarketPrice() > v) {
                System.out.println(stamps.get(i).getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {

        for (int i = 0; i < stamps.size(); i++) {
            if (stamps.contains(postStamp)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        for (int i = 0; i < stamps.size(); i++) {
            if (stamps.get(i).getName().equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        double sum = 0;
        for (int i = 0; i < stamps.size(); i++) {
            sum = sum + stamps.get(i).getMarketPrice();
        }
        return sum;
    }

    @Override
    public double getAveragePostStampPrice() {
        double sum = 0;
        for (int i = 0; i < stamps.size(); i++) {
            sum = sum + stamps.get(i).getMarketPrice();

        }
        return (double) sum / stamps.size();
        //return (double)sum/count;
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        PostStamp mostExpensive = stamps.get(0);
        for (PostStamp pststamp : stamps) {
            if (pststamp.getMarketPrice() > mostExpensive.getMarketPrice()) {
                mostExpensive = pststamp;
            }
        }
        return mostExpensive;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        return stamps.stream().filter(x -> x.getName().contains(s)).collect(Collectors.toList());
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
//        return stamps.stream().sorted(Comparator.comparing(PostStamp::getName)).collect(Collectors.toList());
//    }
        return stamps.stream().sorted((ps1, ps2) -> ps1.getName().compareTo(ps2.getName())).collect(Collectors.toList());
    }

}


