package com.chaitanya.sanoriya.videoapp;

/**
 * Created by WildFire on 22-12-2017.
 */

public class T
{
    public Struct rt(String s, String s1, String s2, int flag)
    {
        Struct struct1 = new Struct();
        if (s.equals("sports"))
        {
            if (s1.equals("music"))
            {
                if (s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if (s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.music_on;
                } else
                {
                    struct1.img2 = R.mipmap.music_off;
                }
                struct1.val2 = "Music";
            } else if (s1.equals("pranks"))
            {
                if (s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else if (s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.pranks_on;
                } else
                {
                    struct1.img2 = R.mipmap.panks_off;
                }
                struct1.val2 = "Pranks";
            } else if (s1.equals("science"))
            {
                if (s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if (s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.science_on;
                } else
                {
                    struct1.img2 = R.mipmap.science_off;
                }
                struct1.val2 = "Science";
            } else if (s1.equals("food"))
            {
                if (s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if (s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }

                    struct1.val3 = "Music";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.food_on;
                } else
                {
                    struct1.img2 = R.mipmap.food_off;
                }
                struct1.val2 = "Food";
            }
            if (flag == 1)
            {
                struct1.img1 = R.mipmap.sports_on;
            } else
            {
                struct1.img1 = R.mipmap.sports_off;
            }
            struct1.val1 = "Sports";
        } else if (s.equals("music"))
        {
            if (s1.equals("sports"))
            {
                if (s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if (s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.sports_on;
                } else
                {
                    struct1.img2 = R.mipmap.sports_off;
                }
                struct1.val2 = "Sports";
            } else if (s1.equals("pranks"))
            {
                if (s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else if (s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.pranks_on;
                } else
                {
                    struct1.img2 = R.mipmap.panks_off;
                }
                struct1.val2 = "Pranks";
            } else if (s1.equals("science"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.science_on;
                } else
                {
                    struct1.img2 = R.mipmap.science_off;
                }
                struct1.val2 = "Science";
            } else if (s1.equals("food"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }

                    struct1.val3 = "Sports";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.food_on;
                } else
                {
                    struct1.img2 = R.mipmap.food_off;
                }
                struct1.val2 = "Food";
            }
            if (flag == 1)
            {
                struct1.img1 = R.mipmap.music_on;
            } else
            {
                struct1.img1 = R.mipmap.music_off;
            }
            struct1.val1 = "Music";
        } else if (s.equals("pranks"))
        {
            if (s1.equals("music"))
            {
                if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.music_on;
                } else
                {
                    struct1.img2 = R.mipmap.music_off;
                }
                struct1.val2 = "Music";
            } else if (s1.equals("sports"))
            {
                if(s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.sports_on;
                } else
                {
                    struct1.img2 = R.mipmap.sports_off;
                }
                struct1.val2 = "Sports";
            } else if (s1.equals("science"))
            {
                if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else if(s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.science_on;
                } else
                {
                    struct1.img2 = R.mipmap.science_off;
                }
                struct1.val2 = "Science";
            } else if (s1.equals("food"))
            {
                if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }

                    struct1.val3 = "Music";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.food_on;
                } else
                {
                    struct1.img2 = R.mipmap.food_off;
                }
                struct1.val2 = "Food";
            }
            if (flag == 1)
            {
                struct1.img1 = R.mipmap.pranks_on;
            } else
            {
                struct1.img1 = R.mipmap.panks_off;
            }
            struct1.val1 = "Pranks";
        } else if (s.equals("science"))
        {
            if (s1.equals("music"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.music_on;
                } else
                {
                    struct1.img2 = R.mipmap.music_off;
                }
                struct1.val2 = "Music";
            } else if (s1.equals("pranks"))
            {
                if(s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.pranks_on;
                } else
                {
                    struct1.img2 = R.mipmap.panks_off;
                }
                struct1.val2 = "Pranks";
            } else if (s1.equals("sports"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.food_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.food_off;
                    }

                    struct1.val3 = "Food";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.sports_on;
                } else
                {
                    struct1.img2 = R.mipmap.sports_off;
                }
                struct1.val2 = "Sports";
            } else if (s1.equals("food"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("sports"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }
                    struct1.val3 = "Sports";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }

                    struct1.val3 = "Music";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.food_on;
                } else
                {
                    struct1.img2 = R.mipmap.food_off;
                }
                struct1.val2 = "Food";
            }
            if (flag == 1)
            {
                struct1.img1 = R.mipmap.science_on;
            } else
            {
                struct1.img1 = R.mipmap.science_off;
            }
            struct1.val1 = "Science";
        } else if (s.equals("food"))
        {
            if (s1.equals("music"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }

                    struct1.val3 = "Sports";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.music_on;
                } else
                {
                    struct1.img2 = R.mipmap.music_off;
                }
                struct1.val2 = "Music";
            } else if (s1.equals("pranks"))
            {
                if(s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }

                    struct1.val3 = "Sports";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.pranks_on;
                } else
                {
                    struct1.img2 = R.mipmap.panks_off;
                }
                struct1.val2 = "Pranks";
            } else if (s1.equals("science"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("music"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }
                    struct1.val3 = "Music";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.sports_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.sports_off;
                    }

                    struct1.val3 = "Sports";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.science_on;
                } else
                {
                    struct1.img2 = R.mipmap.science_off;
                }
                struct1.val2 = "Science";
            } else if (s1.equals("sports"))
            {
                if(s2.equals("pranks"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.pranks_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.panks_off;
                    }
                    struct1.val3 = "Pranks";
                } else if(s2.equals("science"))
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.science_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.science_off;
                    }
                    struct1.val3 = "Science";
                } else
                {
                    if (flag == 3)
                    {
                        struct1.img3 = R.mipmap.music_on;
                    } else
                    {
                        struct1.img3 = R.mipmap.music_off;
                    }

                    struct1.val3 = "Music";
                }
                if (flag == 2)
                {
                    struct1.img2 = R.mipmap.sports_on;
                } else
                {
                    struct1.img2 = R.mipmap.sports_off;
                }
                struct1.val2 = "Sports";
            }
            if (flag == 1)
            {
                struct1.img1 = R.mipmap.food_on;
            } else
            {
                struct1.img1 = R.mipmap.food_off;
            }
            struct1.val1 = "food";
        }
        return struct1;
    }
}
