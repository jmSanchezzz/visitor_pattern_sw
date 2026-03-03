# Visitor Pattern - Telecommunication Subscription System

## Problem Scenario

Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: **Smart**, **Globe**, and **Ditto**.

### Telco Offerings:

**Smart:**
- Data allowance: 15 GB
- Price: ₱500 per month
- Calls/Texts: No unlimited calls or texts - charged per use

**Globe:**
- Data allowance: 10 GB
- Price: ₱450 per month
- Calls/Texts: Unlimited calls and texts to Globe subscribers only (other networks charged extra)

**Ditto:**
- Data allowance: 8 GB
- Price: ₱400 per month
- Calls/Texts: Unlimited calls and texts to all networks within the country

## Design Pattern

This project implements the **Visitor Design Pattern** to handle different operations (viewing data allowance and unlimited call/text offers) on telecommunication subscription objects without modifying the subscription classes themselves.

## UML Class Diagram

<img width="743" height="449" alt="image" src="https://github.com/user-attachments/assets/a8d05b46-977c-409d-9494-6775af6d88a6" />

## Key Components

### 1. Element (TelcoSubscription Interface)
- Defines `accept()` methods that receive visitor objects
- Implemented by concrete `Telco` class

### 2. Concrete Element (Telco Class)
- Represents a telecommunication subscription with properties:
  - telcoName
  - promoPrice
  - dataAllowance
  - unliCallText
- Implements accept methods to delegate operations to visitors

### 3. Visitors (UsagePromo and UnliCallsTextOffer Interfaces)
- `UsagePromo`: Defines operation to show data allowance offers
- `UnliCallsTextOffer`: Defines operation to show unlimited call/text packages

### 4. Concrete Visitors
- `TelcoAllowance`: Implements displaying data allowance information
- `UnliCallTextPackage`: Implements displaying unlimited call/text offer details

