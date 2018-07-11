# encoding: UTF-8
require 'spec_helper'
require_relative 'actionwords'

describe 'DigitalFactory' do
  include Actionwords

  it "Average (uid:87fecc7f-ac8c-416b-a0d6-a426bfe3e000)" do
    # Then should return the average
    should_return_the_average
  end

  it "Maximum (uid:9179c581-bf8f-48a9-af1e-b1d035b86b8f)" do
    # Then should return the maximum number
    should_return_the_maximum_number
  end

  it "Minimum (uid:a0572b10-d979-4bdc-b744-3965abb134af)" do
    # Then should return the minimum number
    should_return_the_minimum_number
  end
end
