select w1.id from weather w1 join weather w2
    on w1.recorddate = w2.recorddate + interval '1' day and w1.temperature > w2.temperature;
